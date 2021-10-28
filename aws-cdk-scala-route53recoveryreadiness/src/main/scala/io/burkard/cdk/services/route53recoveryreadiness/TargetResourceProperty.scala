package io.burkard.cdk.services.route53recoveryreadiness

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TargetResourceProperty {

  def apply(
    r53Resource: Option[software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.R53ResourceRecordProperty] = None,
    nlbResource: Option[software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.NLBResourceProperty] = None
  ): software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.TargetResourceProperty =
    (new software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.TargetResourceProperty.Builder)
      .r53Resource(r53Resource.orNull)
      .nlbResource(nlbResource.orNull)
      .build()
}
