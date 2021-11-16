package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VpcConnectionPropertiesProperty {

  def apply(
    vpcConnectionArn: String
  ): software.amazon.awscdk.services.quicksight.CfnDataSource.VpcConnectionPropertiesProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSource.VpcConnectionPropertiesProperty.Builder)
      .vpcConnectionArn(vpcConnectionArn)
      .build()
}
