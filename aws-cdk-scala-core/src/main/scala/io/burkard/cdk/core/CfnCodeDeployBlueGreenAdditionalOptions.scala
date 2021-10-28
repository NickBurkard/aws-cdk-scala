package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnCodeDeployBlueGreenAdditionalOptions {

  def apply(
    terminationWaitTimeInMinutes: Option[Number] = None
  ): software.amazon.awscdk.CfnCodeDeployBlueGreenAdditionalOptions =
    (new software.amazon.awscdk.CfnCodeDeployBlueGreenAdditionalOptions.Builder)
      .terminationWaitTimeInMinutes(terminationWaitTimeInMinutes.orNull)
      .build()
}
