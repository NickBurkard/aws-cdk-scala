package io.burkard.cdk.services.kms

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object KeyProps {

  def apply(
    keyUsage: Option[software.amazon.awscdk.services.kms.KeyUsage] = None,
    pendingWindow: Option[software.amazon.awscdk.Duration] = None,
    description: Option[String] = None,
    enabled: Option[Boolean] = None,
    admins: Option[List[_ <: software.amazon.awscdk.services.iam.IPrincipal]] = None,
    alias: Option[String] = None,
    keySpec: Option[software.amazon.awscdk.services.kms.KeySpec] = None,
    policy: Option[software.amazon.awscdk.services.iam.PolicyDocument] = None,
    enableKeyRotation: Option[Boolean] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None
  ): software.amazon.awscdk.services.kms.KeyProps =
    (new software.amazon.awscdk.services.kms.KeyProps.Builder)
      .keyUsage(keyUsage.orNull)
      .pendingWindow(pendingWindow.orNull)
      .description(description.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .admins(admins.map(_.asJava).orNull)
      .alias(alias.orNull)
      .keySpec(keySpec.orNull)
      .policy(policy.orNull)
      .enableKeyRotation(enableKeyRotation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .removalPolicy(removalPolicy.orNull)
      .build()
}
