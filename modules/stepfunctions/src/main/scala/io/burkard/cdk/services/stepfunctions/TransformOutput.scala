package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TransformOutput {

  def apply(
    s3OutputPath: String,
    accept: Option[String] = None,
    assembleWith: Option[software.amazon.awscdk.services.stepfunctions.tasks.AssembleWith] = None,
    encryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.TransformOutput =
    (new software.amazon.awscdk.services.stepfunctions.tasks.TransformOutput.Builder)
      .s3OutputPath(s3OutputPath)
      .accept(accept.orNull)
      .assembleWith(assembleWith.orNull)
      .encryptionKey(encryptionKey.orNull)
      .build()
}
