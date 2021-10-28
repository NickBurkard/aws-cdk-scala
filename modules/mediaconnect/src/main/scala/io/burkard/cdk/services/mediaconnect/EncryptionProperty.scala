package io.burkard.cdk.services.mediaconnect

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EncryptionProperty {

  def apply(
    resourceId: Option[String] = None,
    keyType: Option[String] = None,
    url: Option[String] = None,
    constantInitializationVector: Option[String] = None,
    algorithm: Option[String] = None,
    roleArn: Option[String] = None,
    region: Option[String] = None,
    deviceId: Option[String] = None,
    secretArn: Option[String] = None
  ): software.amazon.awscdk.services.mediaconnect.CfnFlow.EncryptionProperty =
    (new software.amazon.awscdk.services.mediaconnect.CfnFlow.EncryptionProperty.Builder)
      .resourceId(resourceId.orNull)
      .keyType(keyType.orNull)
      .url(url.orNull)
      .constantInitializationVector(constantInitializationVector.orNull)
      .algorithm(algorithm.orNull)
      .roleArn(roleArn.orNull)
      .region(region.orNull)
      .deviceId(deviceId.orNull)
      .secretArn(secretArn.orNull)
      .build()
}