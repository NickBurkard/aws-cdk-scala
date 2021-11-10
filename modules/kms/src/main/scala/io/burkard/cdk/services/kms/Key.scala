package io.burkard.cdk.services.kms

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Key {

  def apply(
    internalResourceId: String,
    keyUsage: Option[software.amazon.awscdk.services.kms.KeyUsage] = None,
    pendingWindow: Option[software.amazon.awscdk.Duration] = None,
    enabled: Option[Boolean] = None,
    admins: Option[List[_ <: software.amazon.awscdk.services.iam.IPrincipal]] = None,
    alias: Option[String] = None,
    keySpec: Option[software.amazon.awscdk.services.kms.KeySpec] = None,
    policy: Option[software.amazon.awscdk.services.iam.PolicyDocument] = None,
    description: Option[String] = None,
    trustAccountIdentities: Option[Boolean] = None,
    enableKeyRotation: Option[Boolean] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.kms.Key =
    software.amazon.awscdk.services.kms.Key.Builder
      .create(stackCtx, internalResourceId)
      .keyUsage(keyUsage.orNull)
      .pendingWindow(pendingWindow.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .admins(admins.map(_.asJava).orNull)
      .alias(alias.orNull)
      .keySpec(keySpec.orNull)
      .policy(policy.orNull)
      .description(description.orNull)
      .trustAccountIdentities(trustAccountIdentities.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .enableKeyRotation(enableKeyRotation.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .removalPolicy(removalPolicy.orNull)
      .build()
}
