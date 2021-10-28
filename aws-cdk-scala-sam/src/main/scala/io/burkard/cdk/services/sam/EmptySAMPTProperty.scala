package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EmptySAMPTProperty {

  def apply: software.amazon.awscdk.services.sam.CfnFunction.EmptySAMPTProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.EmptySAMPTProperty.Builder)
      
      .build()
}
