package io.burkard.cdk.services.sso

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPermissionSet {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    relayStateType: Option[String] = None,
    sessionDuration: Option[String] = None,
    managedPolicies: Option[List[String]] = None,
    inlinePolicy: Option[AnyRef] = None,
    instanceArn: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sso.CfnPermissionSet =
    software.amazon.awscdk.services.sso.CfnPermissionSet.Builder
      .create(stackCtx, internalResourceId)
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
