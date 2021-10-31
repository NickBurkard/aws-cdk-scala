package io.burkard.cdk.services.glue

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TransformEncryptionProperty {

  def apply(
    taskRunSecurityConfigurationName: Option[String] = None,
    mlUserDataEncryption: Option[software.amazon.awscdk.services.glue.CfnMLTransform.MLUserDataEncryptionProperty] = None
  ): software.amazon.awscdk.services.glue.CfnMLTransform.TransformEncryptionProperty =
    (new software.amazon.awscdk.services.glue.CfnMLTransform.TransformEncryptionProperty.Builder)
      .taskRunSecurityConfigurationName(taskRunSecurityConfigurationName.orNull)
      .mlUserDataEncryption(mlUserDataEncryption.orNull)
      .build()
}
