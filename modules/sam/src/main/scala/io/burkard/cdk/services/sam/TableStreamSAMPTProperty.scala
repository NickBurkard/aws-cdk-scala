package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TableStreamSAMPTProperty {

  def apply(
    tableName: Option[String] = None,
    streamName: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.TableStreamSAMPTProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.TableStreamSAMPTProperty.Builder)
      .tableName(tableName.orNull)
      .streamName(streamName.orNull)
      .build()
}
