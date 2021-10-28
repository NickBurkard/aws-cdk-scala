package io.burkard.cdk.services.sso

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPermissionSetProps {

  def apply(
    name: Option[String] = None,
    relayStateType: Option[String] = None,
    sessionDuration: Option[String] = None,
    managedPolicies: Option[List[String]] = None,
    inlinePolicy: Option[AnyRef] = None,
    instanceArn: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.sso.CfnPermissionSetProps =
    (new software.amazon.awscdk.services.sso.CfnPermissionSetProps.Builder)
      .name(name.orNull)
      .relayStateType(relayStateType.orNull)
      .sessionDuration(sessionDuration.orNull)
      .managedPolicies(managedPolicies.map(_.asJava).orNull)
      .inlinePolicy(inlinePolicy.orNull)
      .instanceArn(instanceArn.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
