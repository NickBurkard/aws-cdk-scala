package io.burkard.cdk.services.iot

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAuthorizerProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    authorizerName: Option[String] = None,
    status: Option[String] = None,
    tokenKeyName: Option[String] = None,
    tokenSigningPublicKeys: Option[Map[String, String]] = None,
    authorizerFunctionArn: Option[String] = None,
    signingDisabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.iot.CfnAuthorizerProps =
    (new software.amazon.awscdk.services.iot.CfnAuthorizerProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .authorizerName(authorizerName.orNull)
      .status(status.orNull)
      .tokenKeyName(tokenKeyName.orNull)
      .tokenSigningPublicKeys(tokenSigningPublicKeys.map(_.asJava).orNull)
      .authorizerFunctionArn(authorizerFunctionArn.orNull)
      .signingDisabled(signingDisabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
