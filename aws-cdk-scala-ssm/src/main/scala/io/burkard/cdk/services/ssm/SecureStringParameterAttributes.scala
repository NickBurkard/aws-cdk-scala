package io.burkard.cdk.services.ssm

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SecureStringParameterAttributes {

  def apply(
    simpleName: Option[Boolean] = None,
    version: Option[Number] = None,
    parameterName: Option[String] = None,
    encryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None
  ): software.amazon.awscdk.services.ssm.SecureStringParameterAttributes =
    (new software.amazon.awscdk.services.ssm.SecureStringParameterAttributes.Builder)
      .simpleName(simpleName.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .version(version.orNull)
      .parameterName(parameterName.orNull)
      .encryptionKey(encryptionKey.orNull)
      .build()
}
