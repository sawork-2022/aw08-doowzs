/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package edu.nju.sa2022.micropos.order.api;

import edu.nju.sa2022.micropos.order.dto.ErrorDto;
import edu.nju.sa2022.micropos.order.dto.OrderDto;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-09T16:50:14.014548+08:00[Asia/Shanghai]")
@Validated
@Api(value = "orders", description = "the orders API")
public interface OrdersApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /orders : Create new order
     *
     * @return Expected response to a valid request (status code 200)
     *         or unexpected error (status code 200)
     */
    @ApiOperation(value = "Create new order", nickname = "createOrder", notes = "", response = OrderDto.class, tags={ "orders", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response to a valid request", response = OrderDto.class),
        @ApiResponse(code = 200, message = "unexpected error", response = ErrorDto.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/orders",
        produces = { "application/json" }
    )
    default ResponseEntity<OrderDto> createOrder() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"total\" : \"\", \"id\" : \"id\", \"userId\" : \"userId\", \"items\" : { \"key\" : \"\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /orders/{orderId} : Get order
     *
     * @param orderId The id of the order to retrieve (required)
     * @return Expected response to a valid request (status code 200)
     *         or unexpected error (status code 200)
     */
    @ApiOperation(value = "Get order", nickname = "findOrder", notes = "", response = OrderDto.class, tags={ "orders", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response to a valid request", response = OrderDto.class),
        @ApiResponse(code = 200, message = "unexpected error", response = ErrorDto.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/orders/{orderId}",
        produces = { "application/json" }
    )
    default ResponseEntity<OrderDto> findOrder(@ApiParam(value = "The id of the order to retrieve", required = true) @PathVariable("orderId") String orderId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"total\" : \"\", \"id\" : \"id\", \"userId\" : \"userId\", \"items\" : { \"key\" : \"\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /orders : List orders
     *
     * @return Expected response to a valid request (status code 200)
     *         or unexpected error (status code 200)
     */
    @ApiOperation(value = "List orders", nickname = "listOrders", notes = "", response = OrderDto.class, responseContainer = "List", tags={ "orders", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response to a valid request", response = OrderDto.class, responseContainer = "List"),
        @ApiResponse(code = 200, message = "unexpected error", response = ErrorDto.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/orders",
        produces = { "application/json" }
    )
    default ResponseEntity<List<OrderDto>> listOrders() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"total\" : \"\", \"id\" : \"id\", \"userId\" : \"userId\", \"items\" : { \"key\" : \"\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
