package io.burkard.cdk.services.iot

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAuthorizer {

  def apply(
    internalResourceId: String,
    authorizerFunctionArn: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    authorizerName: Option[String] = None,
    status: Option[String] = None,
    tokenKeyName: Option[String] = None,
    tokenSigningPublicKeys: Option[Map[String, String]] = None,
    signingDisabled: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iot.CfnAuthorizer =
    software.amazon.awscdk.services.iot.CfnAuthorizer.Builder
      .create(stackCtx, internalResourceId)
      .authorizerFunctionArn(authorizerFunctionArn)
      .tags(tags.map(_.asJava).orNull)
      .authorizerName(authorizerName.orNull)
      .status(status.orNull)
      .tokenKeyName(tokenKeyName.orNull)
      .tokenSigningPublicKeys(tokenSigningPublicKeys.map(_.asJava).orNull)
      .signingDisabled(signingDisabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
