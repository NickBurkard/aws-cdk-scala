package io.burkard.cdk.services.sso

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPermissionSetProps {

  def apply(
    name: String,
    instanceArn: String,
    relayStateType: Option[String] = None,
    sessionDuration: Option[String] = None,
    managedPolicies: Option[List[String]] = None,
    inlinePolicy: Option[AnyRef] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.sso.CfnPermissionSetProps =
    (new software.amazon.awscdk.services.sso.CfnPermissionSetProps.Builder)
      .name(name)
      .instanceArn(instanceArn)
      .relayStateType(relayStateType.orNull)
      .sessionDuration(sessionDuration.orNull)
      .managedPolicies(managedPolicies.map(_.asJava).orNull)
      .inlinePolicy(inlinePolicy.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
