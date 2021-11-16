package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TableStreamSAMPTProperty {

  def apply(
    tableName: String,
    streamName: String
  ): software.amazon.awscdk.services.sam.CfnFunction.TableStreamSAMPTProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.TableStreamSAMPTProperty.Builder)
      .tableName(tableName)
      .streamName(streamName)
      .build()
}
