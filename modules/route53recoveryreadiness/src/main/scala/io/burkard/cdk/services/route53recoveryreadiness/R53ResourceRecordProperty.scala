package io.burkard.cdk.services.route53recoveryreadiness

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object R53ResourceRecordProperty {

  def apply(
    domainName: Option[String] = None,
    recordSetId: Option[String] = None
  ): software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.R53ResourceRecordProperty =
    (new software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet.R53ResourceRecordProperty.Builder)
      .domainName(domainName.orNull)
      .recordSetId(recordSetId.orNull)
      .build()
}
