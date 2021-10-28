package io.burkard.cdk.services.elasticbeanstalk

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MaxAgeRuleProperty {

  def apply(
    enabled: Option[Boolean] = None,
    deleteSourceFromS3: Option[Boolean] = None,
    maxAgeInDays: Option[Number] = None
  ): software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxAgeRuleProperty =
    (new software.amazon.awscdk.services.elasticbeanstalk.CfnApplication.MaxAgeRuleProperty.Builder)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .deleteSourceFromS3(deleteSourceFromS3.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .maxAgeInDays(maxAgeInDays.orNull)
      .build()
}
