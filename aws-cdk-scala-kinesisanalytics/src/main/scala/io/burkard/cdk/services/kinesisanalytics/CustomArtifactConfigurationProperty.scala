package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CustomArtifactConfigurationProperty {

  def apply(
    s3ContentLocation: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.S3ContentLocationProperty] = None,
    mavenReference: Option[software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.MavenReferenceProperty] = None,
    artifactType: Option[String] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CustomArtifactConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.CustomArtifactConfigurationProperty.Builder)
      .s3ContentLocation(s3ContentLocation.orNull)
      .mavenReference(mavenReference.orNull)
      .artifactType(artifactType.orNull)
      .build()
}
