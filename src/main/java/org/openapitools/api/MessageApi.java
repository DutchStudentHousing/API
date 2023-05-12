/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.5.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Message;
import org.openapitools.model.PostMessageRequest;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
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
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-12T10:17:15.320226972+02:00[Europe/Amsterdam]")
@Validated
@Tag(name = "message", description = "Receive and send messages")
public interface MessageApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /message : Send a message
     *
     * @param postMessageRequest Message (optional)
     * @return Successfully sent message (status code 201)
     *         or Incorrect message format (status code 400)
     *         or Receiver not found (status code 404)
     */
    @Operation(
        operationId = "postMessage",
        summary = "Send a message",
        tags = { "message" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Successfully sent message", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Message.class))
            }),
            @ApiResponse(responseCode = "400", description = "Incorrect message format"),
            @ApiResponse(responseCode = "404", description = "Receiver not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/message",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Message> postMessage(
        @Parameter(name = "PostMessageRequest", description = "Message") @Valid @RequestBody(required = false) PostMessageRequest postMessageRequest
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"property\" : { \"name\" : \"name\", \"id\" : \"id\" }, \"from\" : { \"name\" : \"name\", \"id\" : 0 }, \"to\" : { \"name\" : \"name\", \"id\" : 0 }, \"content\" : \"content\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
