package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VpcConnectionPropertiesProperty {

  def apply(
    vpcConnectionArn: Option[String] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSource.VpcConnectionPropertiesProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSource.VpcConnectionPropertiesProperty.Builder)
      .vpcConnectionArn(vpcConnectionArn.orNull)
      .build()
}
