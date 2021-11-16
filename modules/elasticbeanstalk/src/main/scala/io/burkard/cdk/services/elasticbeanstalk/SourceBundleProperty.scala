package io.burkard.cdk.services.elasticbeanstalk

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SourceBundleProperty {

  def apply(
    s3Bucket: String,
    s3Key: String
  ): software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion.SourceBundleProperty =
    (new software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion.SourceBundleProperty.Builder)
      .s3Bucket(s3Bucket)
      .s3Key(s3Key)
      .build()
}
