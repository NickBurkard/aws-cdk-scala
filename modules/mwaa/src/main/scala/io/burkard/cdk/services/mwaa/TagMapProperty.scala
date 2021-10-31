package io.burkard.cdk.services.mwaa

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TagMapProperty {

  def apply: software.amazon.awscdk.services.mwaa.CfnEnvironment.TagMapProperty =
    (new software.amazon.awscdk.services.mwaa.CfnEnvironment.TagMapProperty.Builder)
      
      .build()
}
