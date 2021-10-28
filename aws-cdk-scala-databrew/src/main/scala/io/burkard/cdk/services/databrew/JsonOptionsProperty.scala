package io.burkard.cdk.services.databrew

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object JsonOptionsProperty {

  def apply(
    multiLine: Option[Boolean] = None
  ): software.amazon.awscdk.services.databrew.CfnDataset.JsonOptionsProperty =
    (new software.amazon.awscdk.services.databrew.CfnDataset.JsonOptionsProperty.Builder)
      .multiLine(multiLine.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
