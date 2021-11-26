package io.burkard.cdk.services.appstream

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScriptDetailsProperty {

  def apply(
    timeoutInSeconds: Number,
    executablePath: String,
    scriptS3Location: software.amazon.awscdk.services.appstream.CfnAppBlock.S3LocationProperty,
    executableParameters: Option[String] = None
  ): software.amazon.awscdk.services.appstream.CfnAppBlock.ScriptDetailsProperty =
    (new software.amazon.awscdk.services.appstream.CfnAppBlock.ScriptDetailsProperty.Builder)
      .timeoutInSeconds(timeoutInSeconds)
      .executablePath(executablePath)
      .scriptS3Location(scriptS3Location)
      .executableParameters(executableParameters.orNull)
      .build()
}
