package io.burkard.cdk.services.ssm

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SecureStringParameterAttributes {

  def apply(
    version: Number,
    simpleName: Option[Boolean] = None,
    parameterName: Option[String] = None,
    encryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None
  ): software.amazon.awscdk.services.ssm.SecureStringParameterAttributes =
    (new software.amazon.awscdk.services.ssm.SecureStringParameterAttributes.Builder)
      .version(version)
      .simpleName(simpleName.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .parameterName(parameterName.orNull)
      .encryptionKey(encryptionKey.orNull)
      .build()
}
