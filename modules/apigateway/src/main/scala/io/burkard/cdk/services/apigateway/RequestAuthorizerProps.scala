package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RequestAuthorizerProps {

  def apply(
    identitySources: List[String],
    assumeRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    authorizerName: Option[String] = None,
    resultsCacheTtl: Option[software.amazon.awscdk.Duration] = None,
    handler: Option[software.amazon.awscdk.services.lambda.IFunction] = None
  ): software.amazon.awscdk.services.apigateway.RequestAuthorizerProps =
    (new software.amazon.awscdk.services.apigateway.RequestAuthorizerProps.Builder)
      .identitySources(identitySources.asJava)
      .assumeRole(assumeRole.orNull)
      .authorizerName(authorizerName.orNull)
      .resultsCacheTtl(resultsCacheTtl.orNull)
      .handler(handler.orNull)
      .build()
}
