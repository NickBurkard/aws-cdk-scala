package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CustomArtifactConfigurationProperty {

  def apply(
    artifactType: String,
    s3ContentLocation: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.S3ContentLocationProperty] = None,
    mavenReference: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MavenReferenceProperty] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CustomArtifactConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CustomArtifactConfigurationProperty.Builder)
      .artifactType(artifactType)
      .s3ContentLocation(s3ContentLocation.orNull)
      .mavenReference(mavenReference.orNull)
      .build()
}
