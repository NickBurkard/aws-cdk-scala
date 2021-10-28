package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FecOutputSettingsProperty {

  def apply(
    columnDepth: Option[Number] = None,
    includeFec: Option[String] = None,
    rowLength: Option[Number] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.FecOutputSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.FecOutputSettingsProperty.Builder)
      .columnDepth(columnDepth.orNull)
      .includeFec(includeFec.orNull)
      .rowLength(rowLength.orNull)
      .build()
}
