package io.burkard.cdk.services.cognito

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnUserPoolResourceServerProps {

  def apply(
    name: Option[String] = None,
    identifier: Option[String] = None,
    scopes: Option[List[_]] = None,
    userPoolId: Option[String] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPoolResourceServerProps =
    (new software.amazon.awscdk.services.cognito.CfnUserPoolResourceServerProps.Builder)
      .name(name.orNull)
      .identifier(identifier.orNull)
      .scopes(scopes.map(_.asJava).orNull)
      .userPoolId(userPoolId.orNull)
      .build()
}
