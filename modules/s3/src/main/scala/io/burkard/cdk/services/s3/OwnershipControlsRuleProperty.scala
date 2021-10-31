package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OwnershipControlsRuleProperty {

  def apply(
    objectOwnership: Option[String] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.OwnershipControlsRuleProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.OwnershipControlsRuleProperty.Builder)
      .objectOwnership(objectOwnership.orNull)
      .build()
}
