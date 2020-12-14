package com.migu.pattern.proxy.rpc;

import com.migu.pattern.proxy.rpc.framework.RpcServer;
import com.migu.pattern.proxy.rpc.server.CalculatorService;
import com.migu.pattern.proxy.rpc.server.CalculatorServiceImpl;

public class RpcServerApplication {

    public static void main(String[] args) throws Exception {
      CalculatorService service = new CalculatorServiceImpl();
      RpcServer server = new RpcServer();
      server.export(service, 1234);
    }

}