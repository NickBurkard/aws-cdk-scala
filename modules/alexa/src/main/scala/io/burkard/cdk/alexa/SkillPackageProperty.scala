package io.burkard.cdk.alexa

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SkillPackageProperty {

  def apply(
    s3Bucket: Option[String] = None,
    overrides: Option[software.amazon.awscdk.alexa.ask.CfnSkill.OverridesProperty] = None,
    s3BucketRole: Option[String] = None,
    s3Key: Option[String] = None,
    s3ObjectVersion: Option[String] = None
  ): software.amazon.awscdk.alexa.ask.CfnSkill.SkillPackageProperty =
    (new software.amazon.awscdk.alexa.ask.CfnSkill.SkillPackageProperty.Builder)
      .s3Bucket(s3Bucket.orNull)
      .overrides(overrides.orNull)
      .s3BucketRole(s3BucketRole.orNull)
      .s3Key(s3Key.orNull)
      .s3ObjectVersion(s3ObjectVersion.orNull)
      .build()
}
