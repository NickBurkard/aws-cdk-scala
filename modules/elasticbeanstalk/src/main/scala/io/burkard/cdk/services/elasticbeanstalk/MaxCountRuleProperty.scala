package io.burkard.cdk.services.elasticbeanstalk

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MaxCountRuleProperty {

  def apply(
    enabled: Option[Boolean] = None,
    maxCount: Option[Number] = None,
    deleteSourceFromS3: Option[Boolean] = None
  ): software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxCountRuleProperty =
    (new software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxCountRuleProperty.Builder)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .maxCount(maxCount.orNull)
      .deleteSourceFromS3(deleteSourceFromS3.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
