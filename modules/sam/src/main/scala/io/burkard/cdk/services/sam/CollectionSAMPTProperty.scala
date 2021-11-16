package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CollectionSAMPTProperty {

  def apply(
    collectionId: String
  ): software.amazon.awscdk.services.sam.CfnFunction.CollectionSAMPTProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.CollectionSAMPTProperty.Builder)
      .collectionId(collectionId)
      .build()
}
