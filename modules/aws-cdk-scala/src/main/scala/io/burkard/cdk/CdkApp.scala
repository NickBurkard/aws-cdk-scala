package io.burkard.cdk

/**
 * CDK application, can have one or more stacks.
 * @param props Optional app properties.
 */
abstract class CdkApp(props: Option[software.amazon.awscdk.AppProps] = None)
  extends software.amazon.awscdk.App(props.orNull) {

  // Context for initializing one or more stacks.
  protected[this] implicit lazy val appCtx: software.amazon.awscdk.App = this

  def main(args: Array[String]): Unit =
    run()

  // Supposedly always needed due to this jsii issue:
  // https://github.com/aws/jsii/issues/456
  protected[this] final def run(): Unit =
    ValueDiscard[software.amazon.awscdk.cxapi.CloudAssembly](synth())
}
