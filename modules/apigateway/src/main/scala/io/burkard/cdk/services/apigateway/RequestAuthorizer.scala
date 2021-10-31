package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RequestAuthorizer {

  def apply(
    internalResourceId: String,
    assumeRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    identitySources: Option[List[String]] = None,
    authorizerName: Option[String] = None,
    resultsCacheTtl: Option[software.amazon.awscdk.Duration] = None,
    handler: Option[software.amazon.awscdk.services.lambda.IFunction] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.RequestAuthorizer =
    software.amazon.awscdk.services.apigateway.RequestAuthorizer.Builder
      .create(stackCtx, internalResourceId)
      .assumeRole(assumeRole.orNull)
      .identitySources(identitySources.map(_.asJava).orNull)
      .authorizerName(authorizerName.orNull)
      .resultsCacheTtl(resultsCacheTtl.orNull)
      .handler(handler.orNull)
      .build()
}
