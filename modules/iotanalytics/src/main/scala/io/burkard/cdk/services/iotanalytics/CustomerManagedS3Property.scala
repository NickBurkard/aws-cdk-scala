package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CustomerManagedS3Property {

  def apply(
    roleArn: String,
    bucket: String,
    keyPrefix: Option[String] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnChannel.CustomerManagedS3Property =
    (new software.amazon.awscdk.services.iotanalytics.CfnChannel.CustomerManagedS3Property.Builder)
      .roleArn(roleArn)
      .bucket(bucket)
      .keyPrefix(keyPrefix.orNull)
      .build()
}
