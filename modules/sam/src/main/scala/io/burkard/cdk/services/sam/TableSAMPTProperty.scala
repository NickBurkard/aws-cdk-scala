package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TableSAMPTProperty {

  def apply(
    tableName: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.TableSAMPTProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.TableSAMPTProperty.Builder)
      .tableName(tableName.orNull)
      .build()
}
