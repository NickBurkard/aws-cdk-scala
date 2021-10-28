package io.burkard.cdk.services.apigateway

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LambdaIntegrationOptions {

  def apply(
    integrationResponses: Option[List[_ <: software.amazon.awscdk.services.apigateway.IntegrationResponse]] = None,
    cacheKeyParameters: Option[List[String]] = None,
    allowTestInvoke: Option[Boolean] = None,
    requestTemplates: Option[Map[String, String]] = None,
    contentHandling: Option[software.amazon.awscdk.services.apigateway.ContentHandling] = None,
    passthroughBehavior: Option[software.amazon.awscdk.services.apigateway.PassthroughBehavior] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None,
    connectionType: Option[software.amazon.awscdk.services.apigateway.ConnectionType] = None,
    requestParameters: Option[Map[String, String]] = None,
    credentialsPassthrough: Option[Boolean] = None,
    cacheNamespace: Option[String] = None,
    credentialsRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    proxy: Option[Boolean] = None,
    vpcLink: Option[software.amazon.awscdk.services.apigateway.IVpcLink] = None
  ): software.amazon.awscdk.services.apigateway.LambdaIntegrationOptions =
    (new software.amazon.awscdk.services.apigateway.LambdaIntegrationOptions.Builder)
      .integrationResponses(integrationResponses.map(_.asJava).orNull)
      .cacheKeyParameters(cacheKeyParameters.map(_.asJava).orNull)
      .allowTestInvoke(allowTestInvoke.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .requestTemplates(requestTemplates.map(_.asJava).orNull)
      .contentHandling(contentHandling.orNull)
      .passthroughBehavior(passthroughBehavior.orNull)
      .timeout(timeout.orNull)
      .connectionType(connectionType.orNull)
      .requestParameters(requestParameters.map(_.asJava).orNull)
      .credentialsPassthrough(credentialsPassthrough.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cacheNamespace(cacheNamespace.orNull)
      .credentialsRole(credentialsRole.orNull)
      .proxy(proxy.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .vpcLink(vpcLink.orNull)
      .build()
}
