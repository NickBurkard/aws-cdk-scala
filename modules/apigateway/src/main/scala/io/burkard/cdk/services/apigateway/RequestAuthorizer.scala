package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RequestAuthorizer {

  def apply(
    internalResourceId: String,
    identitySources: List[String],
    assumeRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    authorizerName: Option[String] = None,
    resultsCacheTtl: Option[software.amazon.awscdk.Duration] = None,
    handler: Option[software.amazon.awscdk.services.lambda.IFunction] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.RequestAuthorizer =
    software.amazon.awscdk.services.apigateway.RequestAuthorizer.Builder
      .create(stackCtx, internalResourceId)
      .identitySources(identitySources.asJava)
      .assumeRole(assumeRole.orNull)
      .authorizerName(authorizerName.orNull)
      .resultsCacheTtl(resultsCacheTtl.orNull)
      .handler(handler.orNull)
      .build()
}
