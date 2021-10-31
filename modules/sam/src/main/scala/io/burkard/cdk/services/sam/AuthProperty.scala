package io.burkard.cdk.services.sam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AuthProperty {

  def apply(
    authorizationScopes: Option[List[String]] = None,
    authorizer: Option[String] = None,
    resourcePolicy: Option[software.amazon.awscdk.services.sam.CfnFunction.AuthResourcePolicyProperty] = None,
    apiKeyRequired: Option[Boolean] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.AuthProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.AuthProperty.Builder)
      .authorizationScopes(authorizationScopes.map(_.asJava).orNull)
      .authorizer(authorizer.orNull)
      .resourcePolicy(resourcePolicy.orNull)
      .apiKeyRequired(apiKeyRequired.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
