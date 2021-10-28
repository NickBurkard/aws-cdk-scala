package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TransformOutput {

  def apply(
    accept: Option[String] = None,
    s3OutputPath: Option[String] = None,
    assembleWith: Option[software.amazon.awscdk.services.stepfunctions.tasks.AssembleWith] = None,
    encryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.TransformOutput =
    (new software.amazon.awscdk.services.stepfunctions.tasks.TransformOutput.Builder)
      .accept(accept.orNull)
      .s3OutputPath(s3OutputPath.orNull)
      .assembleWith(assembleWith.orNull)
      .encryptionKey(encryptionKey.orNull)
      .build()
}
