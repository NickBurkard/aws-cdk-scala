package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SSESpecificationProperty {

  def apply(
    sseEnabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.sam.CfnSimpleTable.SSESpecificationProperty =
    (new software.amazon.awscdk.services.sam.CfnSimpleTable.SSESpecificationProperty.Builder)
      .sseEnabled(sseEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
