package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StepFunctionsExecutionIntegrationOptions {

  def apply(
    path: Option[Boolean] = None,
    integrationResponses: Option[List[_ <: software.amazon.awscdk.services.apigateway.IntegrationResponse]] = None,
    cacheKeyParameters: Option[List[String]] = None,
    requestTemplates: Option[Map[String, String]] = None,
    contentHandling: Option[software.amazon.awscdk.services.apigateway.ContentHandling] = None,
    requestContext: Option[software.amazon.awscdk.services.apigateway.RequestContext] = None,
    headers: Option[Boolean] = None,
    passthroughBehavior: Option[software.amazon.awscdk.services.apigateway.PassthroughBehavior] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None,
    requestParameters: Option[Map[String, String]] = None,
    credentialsPassthrough: Option[Boolean] = None,
    cacheNamespace: Option[String] = None,
    credentialsRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    vpcLink: Option[software.amazon.awscdk.services.apigateway.IVpcLink] = None,
    querystring: Option[Boolean] = None,
    connectionType: Option[software.amazon.awscdk.services.apigateway.ConnectionType] = None
  ): software.amazon.awscdk.services.apigateway.StepFunctionsExecutionIntegrationOptions =
    (new software.amazon.awscdk.services.apigateway.StepFunctionsExecutionIntegrationOptions.Builder)
      .path(path.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .integrationResponses(integrationResponses.map(_.asJava).orNull)
      .cacheKeyParameters(cacheKeyParameters.map(_.asJava).orNull)
      .requestTemplates(requestTemplates.map(_.asJava).orNull)
      .contentHandling(contentHandling.orNull)
      .requestContext(requestContext.orNull)
      .headers(headers.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .passthroughBehavior(passthroughBehavior.orNull)
      .timeout(timeout.orNull)
      .requestParameters(requestParameters.map(_.asJava).orNull)
      .credentialsPassthrough(credentialsPassthrough.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cacheNamespace(cacheNamespace.orNull)
      .credentialsRole(credentialsRole.orNull)
      .vpcLink(vpcLink.orNull)
      .querystring(querystring.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .connectionType(connectionType.orNull)
      .build()
}
