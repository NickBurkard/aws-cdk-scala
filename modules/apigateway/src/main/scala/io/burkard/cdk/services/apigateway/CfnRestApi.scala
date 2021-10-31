package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRestApi {

  def apply(
    internalResourceId: String,
    body: Option[AnyRef] = None,
    name: Option[String] = None,
    apiKeySourceType: Option[String] = None,
    binaryMediaTypes: Option[List[String]] = None,
    failOnWarnings: Option[Boolean] = None,
    cloneFrom: Option[String] = None,
    disableExecuteApiEndpoint: Option[Boolean] = None,
    endpointConfiguration: Option[software.amazon.awscdk.services.apigateway.CfnRestApi.EndpointConfigurationProperty] = None,
    mode: Option[String] = None,
    bodyS3Location: Option[software.amazon.awscdk.services.apigateway.CfnRestApi.S3LocationProperty] = None,
    minimumCompressionSize: Option[Number] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    parameters: Option[Map[String, String]] = None,
    policy: Option[AnyRef] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.CfnRestApi =
    software.amazon.awscdk.services.apigateway.CfnRestApi.Builder
      .create(stackCtx, internalResourceId)
      .body(body.orNull)
      .name(name.orNull)
      .apiKeySourceType(apiKeySourceType.orNull)
      .binaryMediaTypes(binaryMediaTypes.map(_.asJava).orNull)
      .failOnWarnings(failOnWarnings.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cloneFrom(cloneFrom.orNull)
      .disableExecuteApiEndpoint(disableExecuteApiEndpoint.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .endpointConfiguration(endpointConfiguration.orNull)
      .mode(mode.orNull)
      .bodyS3Location(bodyS3Location.orNull)
      .minimumCompressionSize(minimumCompressionSize.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .parameters(parameters.map(_.asJava).orNull)
      .policy(policy.orNull)
      .build()
}
