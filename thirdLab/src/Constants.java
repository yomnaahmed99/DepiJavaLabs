public class Constants {

    final static int INFORMATIONAL = 1;
    final static int SUCCESS = 2;
    final static int REDIRECTION = 3;
    final static int CLIENT_ERROR = 4;
    final static int SERVER_ERROR = 5;

    public class Success {
        final static int OK = 200;
        final static int CREATED = 201;
        final static int ACCEPTED = 202;
        final static int NO_CONTENT = 204;
    }

    public class Informational {

        final static int CONTINUE = 100;
    }

    public class Redirection {

        final static int MOVED_PERMANENTLY = 301;
        final static int FOUND = 302;
        final static int NOT_MODIFIED = 304;
    }

    public class ClientError{

        final static int BAD_REQUEST = 400;
        final static int NOT_FOUND = 404;
        final static int CONFLICT = 409;
        final static int UNAUTHORIZED = 401;
        final static int FORBIDDEN = 403;
        final static int METHOD_NOT_ALLOWED = 405;
        final static int TOO_MANY_REQUESTS = 429;

    }

    public class ServerError{
        final static int INTERNAL_SERVER_ERROR = 500;
        final static int BAD_GATEWAY = 502;
        final static int SERVICE_UNAVAILABLE = 503;
        final static int GATEWAY_TIMEOUT = 504;
    }

}
