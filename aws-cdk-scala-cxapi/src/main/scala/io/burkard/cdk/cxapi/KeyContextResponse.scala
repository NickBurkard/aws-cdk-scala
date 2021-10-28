package io.burkard.cdk.cxapi

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object KeyContextResponse {

  def apply(
    keyId: Option[String] = None
  ): software.amazon.awscdk.cxapi.KeyContextResponse =
    (new software.amazon.awscdk.cxapi.KeyContextResponse.Builder)
      .keyId(keyId.orNull)
      .build()
}
