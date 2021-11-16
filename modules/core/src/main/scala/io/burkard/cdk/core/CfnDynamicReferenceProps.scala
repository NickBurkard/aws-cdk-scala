package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDynamicReferenceProps {

  def apply(
    referenceKey: String,
    service: software.amazon.awscdk.CfnDynamicReferenceService
  ): software.amazon.awscdk.CfnDynamicReferenceProps =
    (new software.amazon.awscdk.CfnDynamicReferenceProps.Builder)
      .referenceKey(referenceKey)
      .service(service)
      .build()
}
