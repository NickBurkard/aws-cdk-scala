package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CollectionSAMPTProperty {

  def apply(
    collectionId: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.CollectionSAMPTProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.CollectionSAMPTProperty.Builder)
      .collectionId(collectionId.orNull)
      .build()
}
