(xor
    (seq
        (seq
            (call relay ("op" "identity") [])
            (call node_1 (service "init_service") [use_owner use_paywall api_key] result)
        )
        (seq
            (call relay ("op" "identity") [])
            (call %init_peer_id% (returnService "run") [result])
        )
    )
    (seq
        (call relay ("op" "identity") [])
        (call %init_peer_id% (returnService "run") ["XOR FAILED" %last_error%])
    )   
)