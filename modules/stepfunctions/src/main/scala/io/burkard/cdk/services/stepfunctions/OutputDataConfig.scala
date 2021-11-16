package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OutputDataConfig {

  def apply(
    s3OutputLocation: software.amazon.awscdk.services.stepfunctions.tasks.S3Location,
    encryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.OutputDataConfig =
    (new software.amazon.awscdk.services.stepfunctions.tasks.OutputDataConfig.Builder)
      .s3OutputLocation(s3OutputLocation)
      .encryptionKey(encryptionKey.orNull)
      .build()
}
