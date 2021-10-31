package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResultConfiguration {

  def apply(
    encryptionConfiguration: Option[software.amazon.awscdk.services.stepfunctions.tasks.EncryptionConfiguration] = None,
    outputLocation: Option[software.amazon.awscdk.services.s3.Location] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.ResultConfiguration =
    (new software.amazon.awscdk.services.stepfunctions.tasks.ResultConfiguration.Builder)
      .encryptionConfiguration(encryptionConfiguration.orNull)
      .outputLocation(outputLocation.orNull)
      .build()
}
